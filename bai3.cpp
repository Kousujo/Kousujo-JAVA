#include <iostream>
#include <vector>

using namespace std;

void sort(long long[] a, n) {
    for ( int i = 1 ; i <= n - 1 ; i++ ) {
        int key = a[i]; 
        int j = i - 1; 
        while ( j >= 0 && a[j] > key ) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;
}

int main {
    int n;
    cin >> n;
    vector<long long> a(n);
    vector<long long> chan(n), le(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
        if (a[i] % 2 == 0) a[i] = chan[i];
        else a[i] = le[i];
    }

    sort(chan, n);
    sort(le, n);

    for (int i = 0; i < chan; i++) {
        cout << chan[i] << " ";
    }
    for (int i = 0; i < le; i++) {
        cout << le[i] << " ";
    }
    return 0;
}

