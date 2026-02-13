/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode *result=NULL ;
    if(head==NULL || head->next==NULL)
    {
        result=head ;
        return result ;
    }
    while(head!=NULL)
    {
        struct ListNode *copy ;
        copy=head ;
        head=head->next ;
        copy->next=result ;
        result=copy ;
    }
    return result ;
}