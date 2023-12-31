// BubbleSort Algotrithm in JavaScript

function BubbleSort(){
    const array = [5, 3, 2, 1, 10, 15, 12, 11, 9, 8, 7, 6];
    const len = array.length;

    AscendingBubbleSort(array, len);
    ShowArray(array, len);
    console.log('\n');
    console.log('Descending Order');
    DescendingBubbleSort(array, len);
    ShowArray(array, len);
}


function ShowArray(arr, len){
    let i;
    for(i = 0; i < len; i++){
        if(i === len - 1){
            console.log(arr[i]);
            break;
        }
        console.log(arr[i] + ' , ');
    }
}


// BubbleSort in Ascending Order
function AscendingBubbleSort(arr, x){
    let i,j;
    for(i = 0; i < x; i++){
        for (j = 0; j < x - i - 1; j++){
            if(arr[j] > arr[j + 1]){
                let minimum = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = minimum;
            }
        }
    }
}

function DescendingBubbleSort(arr, x){
    let i,j;
    for(i = 0; i < x; i++){
        for (j = 0; j < x - i - 1; j++){
            if(arr[j] < arr[j + 1]){
                let minimum = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = minimum;
            }
        }
    }
}

BubbleSort()
