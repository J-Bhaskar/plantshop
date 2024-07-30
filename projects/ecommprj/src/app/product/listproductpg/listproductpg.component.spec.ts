import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ListproductpgComponent } from './listproductpg.component';

describe('ListproductpgComponent', () => {
  let component: ListproductpgComponent;
  let fixture: ComponentFixture<ListproductpgComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ListproductpgComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(ListproductpgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
