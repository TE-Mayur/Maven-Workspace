function quickSort(originalArr) {
    if (originalArr.length <= 1) {
       return originalArr;
       } else {
             var leftArr = [];              
             var rightArr = [];
             var newArr = [];
             var pivot = originalArr.pop();      
             var length = originalArr.length;
             for (var i = 0; i < length; i++) {
                if (originalArr[i] <= pivot) {  
                   leftArr.push(originalArr[i]);      
             } else {
                     rightArr.push(originalArr[i]);
           }
         }
       return newArr.concat(quickSort(leftArr), pivot, quickSort(rightArr));                                                                           //returned untill sorting occurs
    }
 }
 var myArray = [9, 0, 2, 7, -2, 6, 1 ];
 document.write("Original array: " + myArray);
 var sortedArray = quickSort(myArray);
 document.write("Sorted array: " + sortedArray);
