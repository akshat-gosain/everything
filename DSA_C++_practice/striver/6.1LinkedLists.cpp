#include <bits/stdc++.h>
using namespace std;


void printVector(const std::vector<int>& vec) {
    for (int num : vec){
        cout << num << " ";}
        cout << std::endl;
}

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Node{
    public:
    int data;
    Node* next;

    public:
    Node(int data1, Node* next1){
        data = data1;
        next = next1;
    }

    public:
    Node(int data1){
        data = data1;
        next = nullptr;
    }   

};

void printLL(Node* head){
    Node* temp = head;
    while(temp!=nullptr){
        cout << temp->data << " ";
        temp = temp->next;
    }
    cout << endl;
}

Node* insert(int data, Node* next){
        Node* newNode = new Node(data, next);
        return newNode;
    }

Node* deleteLast(Node* head){
    // if(head == nullptr){
    //     return nullptr;
    // }
    // if(head->next == nullptr){
    //     delete head;
    //     return nullptr;
    // }
    Node* temp = head;
    while(temp->next->next!=nullptr){
        temp = temp->next;
    }
    // delete temp->next;
    temp->next = nullptr;
    return head;
}


Node* insertAtEnd(int data, Node* head){
    Node* newNode = new Node(data);
    if(head == nullptr){
        return newNode;
    }
    Node* temp = head;
    while(temp->next!=nullptr){
        temp = temp->next;
    }
    temp->next = newNode;
    return head;
}

Node* convertArr2LL(vector<int> &arr){
    Node* head = new Node(arr[0]);
    Node* temp = head;
    for(int i=1; i<arr.size(); i++){
        temp->next = new Node(arr[i]);
        temp = temp->next;
    }
    return head;
}

int lengthLL(Node* head){
    int count = 0;
    Node* temp = head;
    while(temp){
        temp = temp->next;
        count++;
        }
    return count;
}

int checkLL(Node* head, int val){
    Node* temp = head;
    while(temp){
        if(temp->data == val){
            return 1;
        }
        temp = temp->next;
    }
    return 0;
}

// void deleteNode(ListNode* node) {
//     ListNode* temp = node->next;
//     node->val = temp->val;
//     node->next = temp->next;
//     delete temp;
// }

void deleteNode(Node* node, int key){
    Node* temp = node;
    Node* prev = nullptr;

    while(temp != nullptr && temp->data!=key){
        prev = temp;
        temp = temp->next;
    }

    prev->next = temp->next;
    delete temp;
}

Node* middleNode(Node* head) {
        int n = lengthLL(head);
        for(int i=0; i<n/2; i++){
            head = head->next;
        }
        return head;

    }

Node* reverseLL(Node* head){
    Node* prev = nullptr;
    Node* curr = head;
    Node* next = nullptr;
    while(curr!=nullptr){
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

bool hasCycle(Node *head) {
    Node* slow = head;
    Node* fast = head;
    while(fast!=nullptr && fast->next!=nullptr){
        slow = slow->next;
        fast = fast->next->next;
        if(slow == fast){
            return true;
        }
    }
    return false;
}

int main(){
    int n;
    cin >> n;

    vector<int> arr(n);
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }

    Node* head = convertArr2LL(arr);
    // cout << head->data << endl;
    // deleteLast(head);

    // int m;
    // cin >> m;
    // deleteNode(head, m);

    printLL(reverseLL(head));
    // cout << lengthLL(head) << endl;

    // cout << middleNode(head)->data << endl;

    return 0;
}