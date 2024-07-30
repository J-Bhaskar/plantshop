import { Component, ElementRef, ViewChild } from '@angular/core';
import { CustomService } from '../../../services/custom.service';
import { Category } from '../../../models/Category';


@Component({
  selector: 'app-productpg',
  templateUrl: './productpg.component.html',
  styleUrl: './productpg.component.css',

})
export class ProductpgComponent  {

  catobj:Category[]=[];
  prdt:any

  @ViewChild("mod_1",{static:false}) mod_1?:ElementRef;

  selectedFile: File = null;

  prnm :''
  price:''
  qty:''
  pic:BinaryType
  desc:''
  ct:Category[]


    constructor(private customserv:CustomService)
    {
      this.customserv.getallcategory().subscribe(res=>
        {
        this.catobj = res
        }
       ,
        error=>console.log(error)
      );

    this.customserv.getallproducts().subscribe(
        response=>{
          this.prdt=response
        },
        error=>console.log(error)
        );

    }






    handleSelectChange(e:any)
    {
      var selectElement = e.target;
      var value = selectElement.value;
      this.ct =this.catobj.filter(m=>m.catid==value)

    }




addnewclose()
  {
    (this.mod_1?.nativeElement as HTMLElement).style.display="none";
    document.body.classList.remove('model-open');
  }


addnewsave()
{


  //save logic
  let data = {
    prnm :this.prnm,
    price:this.price,
    qty:this.qty,
    desc:this.desc,
    ct:{catid:this.ct[0].catid,catnm:this.ct[0].catnm}
  }

  const formData = new FormData();


      formData.append('data',new Blob([JSON.stringify(data)],{ type: "application/json"}));
      formData.append('pic', this.selectedFile);

  this.customserv.addcake(formData).subscribe(
    res=>{
      console.log(res)
    console.log(formData)
      },
    error=>console.log(error));


    (this.mod_1?.nativeElement as HTMLElement).style.display="none";
    document.body.classList.remove('model-open');

}


onFileSelected(event: any) {
  this.selectedFile = event.target.files[0];
}


}
