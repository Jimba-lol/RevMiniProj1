import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { GetRandomComponent } from './views/get-random/get-random.component';
import { PostToServerComponent } from './views/post-to-server/post-to-server.component';


const routes: Routes = [
 { path: 'get-moods', component: GetRandomComponent },
 { path: 'post-moods', component: PostToServerComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
