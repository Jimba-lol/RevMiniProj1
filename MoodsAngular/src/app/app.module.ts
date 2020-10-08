import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViewsModule } from './views/views.module';

import { MoodService } from './services/mood.service';
import { SentenceService } from './services/sentence.service';

@NgModule({
  declarations: [
    AppComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ViewsModule,
    FormsModule
  ],
  providers: [
    MoodService,
    SentenceService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
