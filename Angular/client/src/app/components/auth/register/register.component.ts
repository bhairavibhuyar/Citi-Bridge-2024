import { Component } from '@angular/core';
import { RegisterEmp } from '../../../models/register-emp';
import { FormsModule } from '@angular/forms';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { AuthService } from '../../../services/auth.service';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [FormsModule, HttpClientModule],
  providers: [HttpClient, AuthService],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css',
})
export class RegisterComponent {
  emp: RegisterEmp = new RegisterEmp();
  constructor(private authService: AuthService) {}
  registerSubmit() {
    console.log(this.emp);
    this.authService.registerEmp(this.emp).subscribe((res) => {
      console.log('success');
    });
  }
}
