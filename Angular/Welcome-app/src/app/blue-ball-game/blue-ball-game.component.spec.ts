import { ComponentFixture, TestBed } from '@angular/core/testing';

import { BlueBallGameComponent } from './blue-ball-game.component';

describe('BlueBallGameComponent', () => {
  let component: BlueBallGameComponent;
  let fixture: ComponentFixture<BlueBallGameComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ BlueBallGameComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(BlueBallGameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
