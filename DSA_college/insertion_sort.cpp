#include <iostream>
#include <vector>
using namespace std;

void insertionSort(std::vector<int>& vec) {
    int n = vec.size();
    for (int i = 1; i < n; ++i) {
        int key = vec[i];
        int j = i - 1;

        // Move elements of vec[0..i-1] that are greater than key to one position ahead of their current position
        while (j >= 0 && vec[j] > key) {
            vec[j + 1] = vec[j];
            j = j - 1;
        }

        vec[j + 1] = key;
    }
}

void printVector(const std::vector<int>& vec) {
    for (int num : vec)
        std::cout << num << " ";
    std::cout << std::endl;
}

int main() {
    // std::vector<int> vec = {12, 11, 13, 5, 6};
    int n;
    cin >> n;
    vector<int> vec(n);
    for(int i = 0; i<n; i++){
        cin >> vec[i];
    }

    std::cout << "Original vector: ";
    printVector(vec);

    insertionSort(vec);

    std::cout << "Sorted vector: ";
    printVector(vec);

    return 0;
}

