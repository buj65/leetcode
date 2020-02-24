/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    var max_profit = 0;
    for (var i = 1; i < prices.length; i++) {
        if (prices[i] > prices[i - 1]) {
            max_profit += (prices[i] - prices[i - 1]);
        }
    }
    return max_profit;
};