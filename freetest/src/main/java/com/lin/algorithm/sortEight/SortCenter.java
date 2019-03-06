package com.lin.algorithm.sortEight;

/**
 * Created by baozang Cotter on 2018/12/10.
 */
public class SortCenter {
    public static void main(String[] args){
        System.out.println(Arrs.get());
        new SortCenter().mergeSort(Arrs.arrs,0,Arrs.arrs.length-1);
        System.out.println(Arrs.get());
    }

    //归并排序
    public void mergeSort(int[] data,int left,int right){
        if(left >= right) return;
        //取中间数
        int center = (left+right)/2;
        //左边数组
        mergeSort(data,left,center);
        //右边数组
        mergeSort(data,center+1,right);
        //合并
        merge(data,left,center,right);
    }

    public void merge(int[] data,int left,int center,int right){
        //右边数组起始索引
        int mid = center+1;
        //临时数组
        int[] tmpArr = new int[data.length];
        //临时索引
        int buf = left;
        //重建索引
        int tmp = left;

        //合并两边数组
        while (left <= center && mid <= right){
            if(data[left] <= data[mid]){
                tmpArr[buf++] = data[left++];
            }else {
                tmpArr[buf++] = data[mid++];
            }
        }

        //将剩余数组放进临时数组
        while (left <= center){
            tmpArr[buf++] = data[left++];
        }
        while (mid <= right){
            tmpArr[buf++] = data[mid++];
        }

        //重建数组
        while (tmp <= right){
            data[tmp] = tmpArr[tmp++];
        }

    }

    //快速排序-交换排序
    public void quickSort(int[] data,int low,int high){
        if(low < high){
            int middle = getMiddle(data,low,high);
            quickSort(data,low,middle-1);
            quickSort(data,middle+1,high);
        }
    }

    public int getMiddle(int[] data,int low,int high){
        //定义基准值
        int key = data[low];
        while(low < high){
            while(low < high && data[high] >= key){
                high--;
            }
            data[low] = data[high];
            while(low < high && data[low] <= key){
                low++;
            }
            data[high] = data[low];
        }
        //放置基准值,low等于high
        data[low] = key;
        return low;
    }

    //冒泡排序-交换排序
    public void bubbleSortA(int[] data){
        for(int i=0;i<data.length;i++){
            for(int j=0;j<data.length-1-i;j++){
                if(data[j] > data[j+1]){
                    int tmp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = tmp;
                }
            }
        }
    }

    public void bubbleSortB(int[] data){
        int i = data.length-1;
        while (i>0){
            //记录最后一次交换的位置下标
            int pos = 0;
            for(int j=0; j<i;j++){
                if(data[j] > data[j+1]){
                    int tmp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = tmp;
                    pos = j;
                }
            }
            i = pos;
        }
    }

    //堆排序-选择排序
    public void heapSort(int[] data){
        for(int i=0;i<data.length;i++){
            int last = data.length-1-i;
            createHeap(data,last);
            swap(data,0,last);
        }
    }

    public void createHeap(int[] data , int last){
        //遍历所有双亲节点，构建最小堆
        for(int i=(last-1)/2;i>=0;i--){
            int parent = i;
            //当存在左节点
            while(2*parent+1 <= last){
                //假设左节点为最小节点
                int smaller = 2*parent+1;
                //当存在右节点且比左节点小
                if(smaller < last){
                    if(data[smaller] > data[smaller+1])
                        smaller = smaller + 1;
                }
                //当双亲节点大于子节点，交换
                if(data[smaller] < data[parent]){
                    swap(data,parent,smaller);
                    //将双亲节点往下传递
                    parent = smaller;
                }else {
                    //如果双亲节点为最小的，说明底下最小堆也满足条件
                    break;
                }
            }


        }
    }

    //简单选择排序-选择排序
    public void simpleSelectionSort(int[] data){
        //锁定当前位置
        for(int i=0; i<data.length; i++){
            //k为当前最小值的下标
            int k = i;
            //从数组剩余的其他数中选择最小的
            for(int j=i+1;j<data.length;j++){
                if(data[j] < data[k])
                    k = j;
            }
            swap(data,i,k);
        }
    }

    public void swap(int[] data,int a, int b){
        if (a == b) return;
        data[a] = data[a] + data[b];
        data[b] = data[a] - data[b];
        data[a] = data[a] - data[b];
    }



    //直接插入排序-插入排序
    public void straightIS(int[] data){
        for(int i=1;i<data.length;i++){
            int j;
            int x = data[i];
            for(j=i;j>0 && x<data[j-1];j--){
                data[j] = data[j-1];
            }
            data[j] = x;
        }
    }

    //希尔排序-插入排序
    public void getDK(int[] data){
        int dk = data.length/2;
        while(dk >= 1){
            shellIS(dk,data);
            dk = dk/2;
        }
    }

    public void shellIS(int dk,int[] data){
        for(int i=dk;i<data.length;i++){
            int x = data[i];
            int j;
            //当排序好的最后一位大于当前，才进行插入的循环筛选
            if(data[i-dk] > data[i]){
                for(j=i-dk; j>=0 && x<data[j];j=j-dk){
                    data[j+dk] = data[j];
                }
                data[j+dk] = x;
            }
        }
    }
}
