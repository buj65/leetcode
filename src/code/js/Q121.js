/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
    var max_profit = 0, min_price = prices[0];
    for (var i = 1; i < prices.length; i++) {
        if (prices[i] > min_price) {
            max_profit = Math.max(max_profit, prices[i] - min_price);
        } else {
            min_price = prices[i];
        }
    }
    return max_profit;
};