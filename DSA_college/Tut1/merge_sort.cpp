// https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

long long merge(long long* arr, long long N, long long lb, long long mid, long long ub){
        long long dup[ub-lb+1];
        long long res=0;
        for(long long i=0;i<(ub-lb+1);i++){
            dup[i]=arr[lb+i];
        }
        long long p1=lb,p2=mid+1;
        long long count=0;
        while(p1<=mid&&p2<=ub){
            if(dup[p1-lb]<=dup[p2-lb]){
                arr[lb+count]=dup[p1-lb];
                p1++;
            }
            else{
                arr[lb+count]=dup[p2-lb];
                res+=(mid-p1+1);
                p2++;
            }
            count++;
        }
        while(p1<=mid){
            arr[lb+count]=dup[p1-lb];
            count++;
            p1++;
        }
        while(p2<=ub){
            arr[lb+count]=dup[p2-lb];
            count++;
            p2++;
        }
        return res;
    }
long long merge_sort(long long* arr, long long N, long long lb, long long ub){
    long long res=0;
    if(ub>lb){
        long long mid=lb+((ub-lb)/2);
        res+=merge_sort(arr,N,lb,mid);
        res+=merge_sort(arr,N,mid+1,ub);
        res+=merge(arr,N,lb,mid,ub);
    }
    return res;
}
long long int inversionCount(long long arr[], long long N)
{
    // Your Code Here
    return merge_sort(arr,N,0,N-1);
}