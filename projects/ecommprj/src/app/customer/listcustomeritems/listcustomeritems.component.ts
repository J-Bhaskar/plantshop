import { Component } from '@angular/core';
import { CustomService } from '../../../services/custom.service';

@Component({
  selector: 'app-listcustomeritems',
  templateUrl: './listcustomeritems.component.html',
  styleUrl: './listcustomeritems.component.css'
})
export class ListcustomeritemsComponent {
  pt: any



  tempform = {prnm :'',price:'',qty:'',pic:Blob , desc:'',ct:null}

constructor(private lgserv: CustomService)
{
  this.pt = this.lgserv.filterobj

}

ngDoCheck()
{
  this.pt = this.lgserv.filterobj

}


addtolocalstorage(a?:any)
{
  alert(" Item is added in a Cart ! ")
  console.log(a);
  sessionStorage.setItem(a.prnm,JSON.stringify(a));
}


}
