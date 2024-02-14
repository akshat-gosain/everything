#include <iostream>
#include <vector>
#include <thread> // For this_thread::sleep_for
#include <chrono> // For chrono::milliseconds

using namespace std;

class DSA_Vector {
private:
    vector<int> private_v;

public:
    // Constructor
    DSA_Vector() {
        int N, element;
        cin >> N;
        for (int i = 0; i < N; ++i) {
            cin >> element;
            private_v.push_back(element);
        }
    }

    // Size function to return the size of private_v
    int Size() {
        return private_v.size();
    }
    
    void Push(int value) {
        private_v.push_back(value);
    }

    // Greater function to compare elements at indices i and j
    bool Greater(int i, int j) {
        // Adding a delay of 100 milliseconds
        this_thread::sleep_for(chrono::milliseconds(100));
        // Check if private_v[i] > private_v[j]
        return private_v[i] > private_v[j];
    }

    // Lesser function to compare elements at indices i and j
    bool Lesser(int i, int j) {
        // Adding a delay of 100 milliseconds
        this_thread::sleep_for(chrono::milliseconds(100));
        // Check if private_v[i] < private_v[j]
        return private_v[i] < private_v[j];
    }

    // Diff function to find the difference between elements at indices i and j
    int Diff(int i, int j) {
        // Adding a delay of 100 milliseconds
        this_thread::sleep_for(chrono::milliseconds(100));
        // Calculate and return the difference private_v[i] - private_v[j]
        return private_v[i] - private_v[j];
    }

    // Print function to print elements from v_private[i] to v_private[j]
    void Print(int i, int j) {
        if(i < 0 || j >= private_v.size() || i > j) {
            cout << "Invalid indices." << endl;
            return;
        }
        for(int k = i; k <= j; ++k) {
            cout << private_v[k] << " ";
        }
        cout << endl; // For better formatting
    }
};
