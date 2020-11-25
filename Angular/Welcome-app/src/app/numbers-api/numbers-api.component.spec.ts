import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NumbersAPIComponent } from './numbers-api.component';

describe('NumbersAPIComponent', () => {
  let component: NumbersAPIComponent;
  let fixture: ComponentFixture<NumbersAPIComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NumbersAPIComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NumbersAPIComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
