import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListcustomeritemsComponent } from './listcustomeritems.component';

describe('ListcustomeritemsComponent', () => {
  let component: ListcustomeritemsComponent;
  let fixture: ComponentFixture<ListcustomeritemsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListcustomeritemsComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListcustomeritemsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
