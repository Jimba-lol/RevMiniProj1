import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { PostToServerComponent } from './post-to-server.component';

describe('PostToServerComponent', () => {
  let component: PostToServerComponent;
  let fixture: ComponentFixture<PostToServerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ PostToServerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(PostToServerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
