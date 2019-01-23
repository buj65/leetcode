/**
 * @param {number} n
 * @return {string[][]}
 */
var solveNQueens = function (n) {
    return Solution.main(n);
};
var Solution = {
    //总皇后数、总行数、总列数
    n: 0,
    //储存皇后坐标：下标值为行坐标，元素值为列坐标
    queens: null,
    //储存结果
    result: null,
    //主方法
    main: function (n) {
        this.n = n;
        this.queens = [];
        this.result = [];
        this.putQueen(0);
        return this.result;
    },
    //将皇后放到第i行
    putQueen: function (i) {
        if (i === this.n) {
            this.addLog();
            return;
        }
        for (var j = 0; j < this.n; j++) {
            if (this.check(i, j)) {
                this.queens[i] = j;
                this.putQueen(i + 1);
            }
        }
    },
    //判断(i,j)位置的皇后与已有皇后是否有冲突
    check: function (i, j) {
        for (var x = 0; x < i; x++) {
            var y = this.queens[x];
            if (y === j || x + y === i + j || x - i === y - j) {
                return false;
            }
        }
        return true;
    },
    //添加记录
    addLog: function () {
        var list = [];
        for (var i = 0; i < this.n; i++) {
            var arr = new Array(this.n);
            arr[this.queens[i]] = "Q";
            list[i] = arr.join(".");
        }
        this.result.push(list);
    }
};