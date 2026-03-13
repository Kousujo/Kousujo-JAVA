#include <iostream>
#include <vector>

using namespace std;

void bai1() {
    int n, k;
    cin >> n >> k;
    
    vector<long long> a(n);
    for (int i = 0; i < n; i++) {
        cin >> a[i];
    }

    long long sum = 0;
    for (int i = 0; i < k; i++) {
        sum += a[i];
    }

    long long max_sum = sum;
    int x = 0;


    for (int i = k; i < n; i++) {
        sum = sum + a[i] - a[i - k];
        if (sum > max_sum) {
            max_sum = sum;
            x = i - k + 1;
        }
    }

    cout << max_sum << endl;
    for (int i = x; i < x + k; i++) {
        cout << a[i] << " ";
    }
    cout << endl;
}

int main() {
    int t;
    cin >> t;
    while (t--) {
        bai1();
    }
    return 0;
}