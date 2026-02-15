/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    if(head==NULL) 
    {
        return head ;
    }

    struct ListNode *temp ;
    temp = head ;
    int count = 0 ;
    while(temp!=NULL)
    {
        temp=temp->next ;
        count++ ;
    }
    if(n == count)
    {
        struct ListNode *del = head;
        head = head->next;
        free(del);
        return head;
    }
    temp=head ;
    int x=count-n-1 ;
    int y=0 ;
    while(temp!=NULL) 
    {
        if(y==x)
        {
            struct ListNode *delt ;
            delt=temp->next ;
            temp->next=delt->next ;
            free(delt) ;
            return head ;
        }
        y++ ;
        temp=temp->next ;
    } return head ;
}