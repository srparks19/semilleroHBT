import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VerComicComponent } from './ver-comic.component';

describe('VerComicComponent', () => {
  let component: VerComicComponent;
  let fixture: ComponentFixture<VerComicComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VerComicComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VerComicComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
