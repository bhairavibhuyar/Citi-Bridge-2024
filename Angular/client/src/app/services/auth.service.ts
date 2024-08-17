import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { RegisterEmp } from '../models/register-emp';

@Injectable({
  providedIn: 'root',
})
export class AuthService {
  constructor(private httpClient: HttpClient) {}

  registerEmp(emp: RegisterEmp) {
    return this.httpClient.post('http://localhost:9009/api/emp/add', emp);
  }
}
