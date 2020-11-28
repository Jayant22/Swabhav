import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'searchFilter'
})
export class SearchFilterPipe implements PipeTransform {
  transform(items: any[], searchText: string): any[] {
    searchText = searchText.toLocaleLowerCase();

    return items.filter(it => {
      return it.productName.toLocaleLowerCase().includes(searchText);
    });
  }
}
