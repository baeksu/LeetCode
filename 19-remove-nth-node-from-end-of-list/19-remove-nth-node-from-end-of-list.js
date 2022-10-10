var removeNthFromEnd = function(head, n) {
    let fast = slow = head;
    
    // 미리 fast 를 n 만큼 이동을 시키고 이후에 slow를 출발시키면
    for(let i = 0 ; i<n ; i++){
        fast = fast.next;
    }
    
    //만약에 fast 가 맨끝을 넘어가버리면 제일 첫번째 head 만 없애만 된다.
    if(!fast){
        return head.next;
    }
    
    
    while(fast.next){
        fast = fast.next;
        slow = slow.next;
    }
    
    slow.next = slow.next.next;
    return head;
    
};
