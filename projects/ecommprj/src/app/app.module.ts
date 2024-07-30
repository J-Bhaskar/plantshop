import { CUSTOM_ELEMENTS_SCHEMA, NO_ERRORS_SCHEMA, NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { AdminloginComponent } from './admin/adminlogin/adminlogin.component';
import { CustomerhomeComponent } from './customer/customerhome/customerhome.component';
import { HttpClientModule } from '@angular/common/http';
import { ProductpgComponent } from './product/productpg/productpg.component';
import { CategorypgComponent } from './category/categorypg/categorypg.component';
import { ListproductpgComponent } from './product/listproductpg/listproductpg.component';
import { DashboardpgComponent } from './dashboard/dashboardpg/dashboardpg.component';
import { MatToolbarModule} from '@angular/material/toolbar';
import { MatButtonModule } from '@angular/material/button';
import { AdminheaderComponent } from './admin/adminheader/adminheader.component';
import { provideAnimationsAsync } from '@angular/platform-browser/animations/async';
import { NgxPaginationModule } from 'ngx-pagination';
import {MatTooltipModule} from '@angular/material/tooltip';
import { ListcustomeritemsComponent } from './customer/listcustomeritems/listcustomeritems.component';
import { HomeheaderComponent } from './homeheaderpg/homeheader/homeheader.component';
import { MatMenuModule } from '@angular/material/menu';
import { LoginComponent } from './login/login.component';
import { RegisterComponent } from './register/register.component';
import { CommonModule } from '@angular/common';


@NgModule({
  declarations: [
  AppComponent,
    AdminloginComponent,
    CustomerhomeComponent,
    ProductpgComponent,
    CategorypgComponent,
    ListproductpgComponent,
    DashboardpgComponent,
    AdminheaderComponent,
    ListcustomeritemsComponent,
    HomeheaderComponent,
    LoginComponent,
    RegisterComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule,NgxPaginationModule,MatTooltipModule,MatMenuModule,CommonModule,
    MatToolbarModule,MatButtonModule,ReactiveFormsModule,
    RouterModule.forRoot([
      {path:"admin",component:AdminloginComponent},
      {path:"",redirectTo:"home",pathMatch:"full"},
      {path:"home",component:CustomerhomeComponent},
      {path:"dashboard",component:DashboardpgComponent},
      {path:"product",component:ProductpgComponent},
      {path:"category",component:CategorypgComponent},
      { path:'login',component:LoginComponent },
      { path:'register',component:RegisterComponent }

    ])
  ],
  providers: [
    provideClientHydration(),
    provideAnimationsAsync()
  ],
  bootstrap: [AppComponent],
  schemas: [
    CUSTOM_ELEMENTS_SCHEMA,
    NO_ERRORS_SCHEMA
  ]
})
export class AppModule { }
