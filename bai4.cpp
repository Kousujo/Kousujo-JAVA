#include <iostream>

using namespace std;

struct Node {
    int data;
    Node* next;
    Node* prev;
};

Node* newNode(int x) {
    Node* newNode;
    newNode = new Node();
    newNode->data = x;
    newNode->next = nullptr;
    newNode->prev = nullptr;
    return newNode;
}

int main() {

    int n;
    cin >> n;

    Node* first = nullptr;
    Node* last = nullptr;

    for (int i = 0; i < n; i++) {
        int x;
        cin >> x;
        Node* p = newNode(x);

        if (first == nullptr) {
            first = last = p;
        } else {
            last->next = p;
            p->prev = last;
            last = p;
        }
    }

    Node* p = first;
    while (p != nullptr) {
        cout << p->data << " ";
        p = p->next;
    }
    cout << endl;

    p = last;
    while (p != nullptr) {
        cout << p->data << " ";
        p = p->prev;
    }
    cout << endl;

    return 0;
}