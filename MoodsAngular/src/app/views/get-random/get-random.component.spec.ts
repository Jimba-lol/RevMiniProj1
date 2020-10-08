import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { GetRandomComponent } from './get-random.component';

describe('GetRandomComponent', () => {
  let component: GetRandomComponent;
  let fixture: ComponentFixture<GetRandomComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ GetRandomComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(GetRandomComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
