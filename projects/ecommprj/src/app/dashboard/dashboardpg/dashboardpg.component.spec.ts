import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DashboardpgComponent } from './dashboardpg.component';

describe('DashboardpgComponent', () => {
  let component: DashboardpgComponent;
  let fixture: ComponentFixture<DashboardpgComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [DashboardpgComponent]
    })
    .compileComponents();
    
    fixture = TestBed.createComponent(DashboardpgComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
