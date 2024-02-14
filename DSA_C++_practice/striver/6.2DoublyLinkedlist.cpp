#include <bits/stdc++.h>
using namespace std;

class Node{
    public:
    int data;
    Node* next;
    Node* back;

    public:
    Node(int data1, Node* next1, Node* back1){
        data = data1;
        next = next1;
        back = back1;
    }

    public:
    Node(int data1){
        data = data1;
        next = nullptr;
        back = nullptr;
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

Node* convertArr2LL(vector<int> &arr){
    Node* head = new Node(arr[0]);
    Node* prev = head;
    for(int i=1; i<arr.size(); i++){
        Node* temp = new Node(arr[i], nullptr, prev);
        prev->next = temp;
        prev = temp;
    } 
    return head;
}

Node* deleteHead(Node* head){
    if(head==NULL || head->next==NULL){
        return NULL;
    }
    Node* prev = head;
    head = head->next;

    head->back = nullptr;
    prev->back = nullptr;

    delete prev;
    return head;
}

Node* deleteTail(Node* head){
    if(head == NULL || head->next == NULL){
        return NULL;
    }
    Node* tail = head;
    while(tail->next != NULL){
        tail = tail->next;
    }
    Node* newTail = tail->back;
    newTail->next = nullptr;
    tail->back = nullptr;
    delete tail;
    return head;
}

Node* removeKthElement(Node* head, int pos){
    if(pos == 1){
        return deleteHead(head);
    }
    Node* temp = head;
    for(int i=1; i<pos-1; i++){
        temp = temp->next;
    }
    Node* prev = temp->back;
    Node* next = temp->next;
    prev->next = next;
    next->back = prev;
    temp->next = nullptr;
    temp->back = nullptr;
    delete temp;
    return head;
}

void deleteNode(Node* temp){
    Node* prev = temp->back;
    Node* next = temp->next;
    prev->next = next;
    next->back = prev;
    temp->next = nullptr;
    temp->back = nullptr;
    delete temp;

}
Node* insertbeforeHead(Node* head, int val){
    Node* newHead = new Node(val,head,nullptr);
    head->back = newHead;

    return newHead;
}

Node* insertbeforeTail(Node* head, int val){
    Node* tail = head;
    while(tail->next!=NULL){
        tail = tail->next;
    }

    Node* prev = tail->back;
    Node* newNode = new Node(val,tail,prev);
    prev->next = newNode;
    tail->back = newNode;
    return head;
}

Node* insertbeforeKthElement(Node* head, int k, int val){
    if(k==1){
        return insertbeforeHead(head,val);
    }
    Node* temp = head;
    int cnt=0;
    while(temp!=NULL){
        cnt++;
        if(cnt==k) break;
        temp = temp->next;
    }
    Node* prev = temp->back;
    Node* newNode = new Node(val,temp,prev);
    prev->next = newNode;
    temp->back = newNode;
    return head;

}

void insertBeforeNode(Node* node, int val){
    Node* prev = node->back;
    Node* newNode = new Node(val, node, prev);
    prev->next = newNode;
    node->back = newNode;
}

Node* reverseDLL(Node* head){

    if (head == NULL || head->next == NULL) {
        return head;
    }

    Node* current = head;
    Node* temp = nullptr;
    while(current!=NULL){
        temp = current->back;
        current->back = current->next;
        current->next = temp;

        current = current->back;
    }
    return temp->back;
}

int main(){
    int n;
    cin >> n;
    vector<int> arr(n);
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }

    Node* head = convertArr2LL(arr);
    // printLL(removeKthElement(head, 3));
    // deleteNode(head->next->next);
    head = reverseDLL(head);
    printLL(head);
    return 0;
}