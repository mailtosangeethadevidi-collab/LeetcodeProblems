struct ListNode* modifiedList(int* nums, int numsSize, struct ListNode* head) 
{
    int mark[100001] = {0};

    for(int i=0;i<numsSize;i++)
        mark[nums[i]] = 1;

    while(head && mark[head->val])
    {
        struct ListNode *delt = head;
        head = head->next;
        free(delt);
    }

    struct ListNode *temp = head;

    while(temp && temp->next)
    {
        if(mark[temp->next->val])
        {
            struct ListNode *delt = temp->next;
            temp->next = delt->next;
            free(delt);
        }
        else
        {
            temp = temp->next;
        }
    }

    return head;
}
