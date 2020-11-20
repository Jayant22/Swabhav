import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'snakeCase'
})
export class snakeCasePipe implements PipeTransform{
    transform(firstName: string, lastName: string): string {
        if(firstName == undefined || lastName == undefined) {
            return  "";
        } else {
            return firstName + "_" +lastName;
        }
    }
}