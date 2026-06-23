/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    s=s.trim()
    a=s.split(" ")
    n=a.length
    x=a[a.length-1]
    return x.length
};