/**
 *
 * @author Ryan
 * @param <T>
 */
public class RyanList<T> implements ILinkedList<T>
{
    private ILinkedList<T> next;
    private T data;
    
    public RyanList()
    {
    }
    public RyanList(T paramData)
    {
        ILinkedList<T> next;
        data = paramData;       
    }
    /**
     * Get the next list element
     * @return the next element
     */
    @Override
    public ILinkedList<T> next()
    {
        return next;     
    }
    
      /**
     * Gets the last element in the list
     * @return the node at the end of the list
     */
    @Override
    public ILinkedList<T> last()
    {
        ILinkedList copy = this;
        while(copy.next() != null)
        {
            copy = copy.next();
        }
        return copy;
    }
    /**
     * Get the element n elements down the list
     * @param n the number of elements to skip
     * @return the element n away
     */
    @Override
    public ILinkedList<T> after(int n)
    {
        ILinkedList copy = this;
        for(int i = 0; i < n; i++)
        {
            copy = copy.next();
        }
        return copy;
            
    }

    /**
     * Removes the next element (sets null)
     * @return the previously next element
     */
    @Override
    public ILinkedList<T> detach()
    {
        ILinkedList copy = next;
        next = null;   
        return copy;
    }

    /**
     * Gets the current value
     * @return the current value
     */
    @Override
    public T get()
    {
        return this.data;
    }

    /**
     * Sets the value of this node
     * @param value the new value
     */
    @Override
    public void set(T value)
    {
        this.data =  value;
    }

    /**
     * Sets the next element in the list
     * @param next the next element
     */
    public void setNext(ILinkedList<T> next)
    {
       this.next = next;    
    }
        
    /**
     * Sets the next element after this current element
     * @param next the next element
     */
    @Override
    public void append(ILinkedList<T> next)
    {
        RyanList copy = this;
        while (copy.next != null)
        {
            copy.next();
        }
        copy.next = next;  
    }

    /**
     * Adds the current list as the next of newFirst
     * @param newFirst the new head of the list
     */
    @Override
    public void insert(ILinkedList<T> newFirst)
    {
        RyanList copy = this;
        newFirst.next();
        newFirst = copy;               
    }
}
    
    
    

    
