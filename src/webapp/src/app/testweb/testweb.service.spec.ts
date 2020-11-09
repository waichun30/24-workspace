import { TestBed } from '@angular/core/testing';

import { TestwebService } from './testweb.service';

describe('TestwebService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: TestwebService = TestBed.get(TestwebService);
    expect(service).toBeTruthy();
  });
});
