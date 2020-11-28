import { TestBed } from '@angular/core/testing';

import { StudentApiServiceService } from './student-api-service.service';

describe('StudentApiServiceService', () => {
  let service: StudentApiServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(StudentApiServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
