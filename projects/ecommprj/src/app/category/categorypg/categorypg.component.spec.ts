import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CategorypgComponent } from './categorypg.component';

describe('CategorypgComponent', () => {
  let component: CategorypgComponent;
  let fixture: ComponentFixture<CategorypgComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [CategorypgComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(CategorypgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
