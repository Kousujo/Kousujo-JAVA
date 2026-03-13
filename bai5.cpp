#include <iostream>
#include <vector>

using namespace std;

void Sorttang(vector<long long> a) {
    int n = a.size();
    for (int i = 1; i < n; i++) {
        long long key = a[i]; 
        int j = i - 1;
        while (j >= 0 && a[j] > key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }
}
void Sortgiam(vector<long long> a) {
    int n = a.size();
    for (int i = 1; i < n; i++) {
        long long key = a[i]; 
        int j = i - 1;
        while (j >= 0 && a[j] < key) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
    }
}

int main() {
    int n;
    cin >> n;

    vector<long long> chan, le;
    for (int i = 0; i < n; i++) {
        long long t;
        cin >> t;
        if (t % 2 == 0) {
            chan.push_back(t); 
        } else {
            le.push_back(t); 
        }
    }

    Sorttang(chan);
    Sortgiam(le);

    for (int i = 0; i < chan.size(); i++) {
        cout << chan[i] << " ";
    }

    for (int i = 0; i < le.size(); i++) {
        cout << le[i] << " ";
    }
    
    return 0;
}