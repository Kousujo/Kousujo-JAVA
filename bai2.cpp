#include <iostream>
#include <vector>

using namespace std;

void bai2() {
    int n;
    cin >> n;
    
    vector<long long> a(n);

    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    for ( int i = 1 ; i <= n - 1 ; i++ ) {
        int key = a[i]; 
        int j = i - 1; 
        while ( j >= 0 && a[j] > key ) {
            a[j + 1] = a[j];
            j = j - 1;
        }
        a[j + 1] = key;

        cout << "Buoc " << i << ": ";
        for (int i = 0; i < n; i++) {
            cout << a[i] << " ";
        }
        cout << endl;
    }
}
int main() {
    bai2();
    return 0;
}