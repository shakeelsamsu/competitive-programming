#include <bits/stdc++.h>

using namespace std;

const int MAX = 1e4 + 1;

int t, n, m;
int arr[MAX];

//Solved by JB
//Solved During Contest
int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(0);
    
    for (int x = 0; x < MAX; x++)
        arr[x] = x * x;
    
    cin >> t;
    while (t--) {
        cin >> n >> m;
        int area = n * m;
        int lo = 0, hi = MAX - 1, ans = 0;
        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] >= area)
                ans = arr[hi = mid];
            else 
                lo = mid + 1;
        }
        cout << ans << '\n';
    }
    return 0;
}