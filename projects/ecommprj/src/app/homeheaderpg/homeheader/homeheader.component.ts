import { Component } from '@angular/core';
import { CustomService } from '../../../services/custom.service';

declare var Razorpay: new (arg0: any) => any

@Component({
  selector: 'app-homeheader',
  templateUrl: './homeheader.component.html',
  styleUrl: './homeheader.component.css'
})
export class HomeheaderComponent {


  cart?:any[]=[]
  tot=0;
  options?:any



  constructor(private serv:CustomService){}

    showcart()
    {
      let obj={};
      this.tot=0;
      this.cart=[];

      for (var i = 0; i < sessionStorage.length; ++i) {
        var key = sessionStorage.key(i);
        var val = sessionStorage.getItem(key);
        //console.log(key + ': ' + value);
    obj=JSON.parse(val)
    this.tot += obj["price"]
        this.cart.push(obj);
    }
  }


  deletecart(a?:any)
  {
  let obj={}
  this.tot=0;
    let index = this.cart.indexOf(a);

    this.cart.splice(index, 1);
    //first delete existing list
    sessionStorage.removeItem(a.prnm);

    for (var i = 0; i < sessionStorage.length; ++i) {
      var key = sessionStorage.key(i);
      var value = sessionStorage.getItem(key);
      obj=JSON.parse(value)
      this.tot += obj["price"]
      }
  }


  orderitems()
  {
    let result = window.confirm("Do you really want to confirm the order :");
    if(result)
      {
      this.serv.createTransaction(this.tot).subscribe(
        res => { console.log(res);
        this.openTransactionModal(res);
        sessionStorage.clear();
        },
        err=>
        {
          alert(" Error in confirming the order ! ");
        console.log(err); })
      }
  else {
        alert("Order is not confirm");
        }
  }

  openTransactionModal(response:any)
  {
  this.options={
  order_id: response.orderId,
  key:response.key,
  amount:response.amount,
  currency:response.currency,
  name:'Bhaskar',
  description:'Payment gateway check',
  image:'https://cdn.pixabay.com/photo/2023/05/28/03/34/flowers8022731_640.jpg',
  handler: (response:any) =>{
  this.processResponse(response);
  },
  prefill:{
  name:'Bhaskar',
  email:'bhaskar87j@gmail.com',
  contact:'6305402235',
  },
  notes:{
  address:'Online Shopping'
  },
  theme:{
  color:'#F37254'
  }
  };


  const rzp = new Razorpay(this.options);
  rzp.open();
}



  processResponse(resp:any)
  {
  console.log(resp);
  }



}
