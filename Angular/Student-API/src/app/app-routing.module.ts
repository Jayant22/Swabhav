import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AppComponent } from './app.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { StudentFormComponent } from './student-form/student-form.component';
import { StudentListComponent } from './student-list/student-list.component';
import { StudentUpdateComponent } from './student-update/student-update.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {path: 'home', component: WelcomeComponent},
  {path: 'studentList', component: StudentListComponent},
  {path: 'studentUpdate', component: StudentUpdateComponent},
  {path: 'studentForm', component: StudentFormComponent},
  {path: '**', component: PageNotFoundComponent},
  {path: '', redirectTo: '/home', pathMatch: 'full'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
