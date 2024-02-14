void solve(DSA_Vector& v, int target){
    // *************************************************
    // WRITE YOUR CODE HERE
    
    // int greatestindex = 0;
    // int smallestindex = 0;

    // for(int i = 1; i < v.Size(); i++){
    //     if(v.Greater(i, greatestindex)){
    //         greatestindex = i;
            
    //     }
    //     if(v.Lesser(i, smallestindex)){
    //         smallestindex = i;
    //     }
    // }
    
    // Add the target value to the vector
    v.Push(target);

    int low = 0, high = v.Size() - 2; // Exclude the last element (target)
    while(low <= high){
        int mid = low + (high - low) / 2;
        if(v.Diff(mid, v.Size() - 1) == 0){ // Compare with the last element (target)
            cout << mid << " ";
            return;
        }
        else if(v.Greater(mid, v.Size() - 1)){
            high = mid - 1;
        }
        else{
            low = mid + 1;
        }
    }

    cout << -1 << " ";

    //The indices printed below are wrong
    // cout <<smallestindex<<" "<<greatestindex<<" "<<endl;

    // *************************************************
}
