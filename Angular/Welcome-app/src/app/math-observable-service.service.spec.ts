import { TestBed } from '@angular/core/testing';

import { MathObservableServiceService } from './math-observable-service.service';

describe('MathObservableServiceService', () => {
  let service: MathObservableServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(MathObservableServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
