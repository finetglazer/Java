#include<iostream>
#include<queue>
#include<stack>
using namespace std;

class Graph {
    
    private:
        int n;
        int fi;
        int ed;
        int mt[105][105];
        int parent[105];
        int daddy[105];
    public:
        void init();
        void cal();
       
}

void Graph::init() {
    cin >> n;
    cin >> fi >> ed;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            cin >> mt[i][j];
        }
    }
    for (int i = 0; i <= 105; i++) {
        parent[i] = 0;
        daddy[i] = 0;
    }
}

void Graph::sol(int u) {
    for (int v = 1; v <= n; v++) {
        if (mt[u][v] && !daddy[v]) {
            daddy[v] = u;
            sol(v);
        }
    }
}
void Graph::cal() {
    
    bool check = true;
    queue<int> qu;
    qu.push(fi);
    while (qu.size() != 0) {
        int u = qu.front();
        qu.pop();
        for (int v = 1; v <= n; v++) {
            if (!parent[v] && mt[u][v]) {
                parent[v] = u;
                qu.push(v);
            }
            if (v == ed) {
                check = false;
                break;
            }
        }
        if (!check) {
            break;
        }
    }
    if (check) {
        cout<<"no path";
    } else {
        stack<int> st;
        cout<<"BFS path: ";
        while (parent[ed]) {
            cout<<ed<<" ";
            ed = parent[ed];
        }
       
    }
}

int main() {
    Graph x;
    x.init();
    x.cal();
}