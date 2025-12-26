/**
 * @param {Array} arr
 * @param {number} n
 * @return {Array}
 */
var flat = function (arr, n) {
  const result = [];

  const dfs = (array, depth) => {
    for (const item of array) {
      if (Array.isArray(item) && depth > 0) {
        dfs(item, depth - 1);
      } else {
        result.push(item);
      }
    }
  };

  dfs(arr, n);
  return result;
};