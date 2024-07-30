import { Category } from "./Category";

export class Product
{
id:number=0;
prnm:string='';
price:number=0;
qty:number=0;
pic:Blob=new Blob();

desc:string='';

ct?:Category[];
}
