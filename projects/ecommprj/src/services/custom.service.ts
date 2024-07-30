import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Users } from '../models/Users';
import { Observable } from 'rxjs';
import { Product } from '../models/Product';
import { Category } from '../models/Category';



@Injectable({
  providedIn: 'root'
})
export class CustomService {


  public  filterobj:Product[]=[]
  public allcatobj:Category[]=[]


  //DI for HttpClient modules services
  constructor(private http:HttpClient) { }


  userexists(data:Users)
  {
    return this.http.post("http://localhost:8080/user/checkuser",data)
  }

  addUser(data:Users)
  {
    return this.http.post("http://localhost:8080/user/adduser",data)
  }


  getallproducts():Observable<Product[]>
  {
      return this.http.get<Product[]>("http://localhost:8080/product/listprdt")
  }

  getallcategory():Observable<Category[]>
  {
      return this.http.get<Category[]>("http://localhost:8080/category/catlist")
  }

  addcake(formdata:any)
  {
    return this.http.post("http://localhost:8080/product/addprdt",formdata,{ observe: 'response' });
  }

deleteproduct(id:number)
{
  return this.http.delete("http://localhost:8080/product/delprdt/"+id)
}

//private apiUrl = 'http://localhost:8080/product/updateprdt';

updateproduct(a:Product)
{
  return this.http.put("http://localhost:8080/product/updateprdt",a);
}

/*
updateproduct(updaterec: any): Observable<any> {
  return this.http.put(this.apiUrl, updaterec);
}
*/
createTransaction(amount:any)
{
  return this.http.get("http://localhost:8080/cart/getTransaction/"+amount);
}

sendmail()
{
  return this.http.get("http://localhost:8080/email/sendmail");
}



}
