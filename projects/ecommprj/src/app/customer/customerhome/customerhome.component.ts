import { Component } from '@angular/core';
import { Product } from '../../../models/Product';
import { Category } from '../../../models/Category';
import { CustomService } from '../../../services/custom.service';

@Component({
  selector: 'app-customerhome',
  templateUrl: './customerhome.component.html',
  styleUrl: './customerhome.component.css'
})
export class CustomerhomeComponent {

  obj:Product []=[]
  catobj:Category[]=[]
 catno:number=0

 prdt:Product []=[]




constructor(private customserv:CustomService){


   this.customserv.getallproducts().subscribe(
     res=>{
       this.obj = res;
       this.customserv.filterobj=res;
     },
     err=>console.log(err)
     )


 this.customserv.getallcategory().subscribe(
     res=>{
       this.customserv.allcatobj = res
       this.catobj = res

     },
     err=>console.log(err)
     )
 }

 ngDoCheck()
   {
    this.customserv.filterobj=this.obj.filter(m=>m.ct["catid"]==this.catno)
   }

   catnovalue(val:any)
   {
    this.catno = val;
   }


   sendmail()
   {
    this.customserv.sendmail().subscribe(res=>console.log(res),error=>console.log(error));
   }

}
