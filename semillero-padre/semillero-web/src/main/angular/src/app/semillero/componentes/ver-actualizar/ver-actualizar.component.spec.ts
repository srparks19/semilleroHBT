import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VerActualizarComponent } from './ver-actualizar.component';

describe('VerActualizarComponent', () => {
  let component: VerActualizarComponent;
  let fixture: ComponentFixture<VerActualizarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VerActualizarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VerActualizarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
