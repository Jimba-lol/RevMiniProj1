import { NgModule } from '@angular/core';
import { AppRoutingModule } from '../app-routing.module';

import { NavigationBarComponent } from './navigation-bar/navigation-bar.component';
import { GetRandomComponent } from './get-random/get-random.component';
import { PostToServerComponent } from './post-to-server/post-to-server.component';

export { NavigationBarComponent } from './navigation-bar/navigation-bar.component';
export { GetRandomComponent } from './get-random/get-random.component';
export { PostToServerComponent } from './post-to-server/post-to-server.component';

@NgModule({
  declarations: [
    NavigationBarComponent,
    GetRandomComponent,
    PostToServerComponent
  ],
  imports: [
    AppRoutingModule
  ],
  exports: [
    NavigationBarComponent,
    GetRandomComponent,
    PostToServerComponent,
  ]
})
export class ViewsModule { }
