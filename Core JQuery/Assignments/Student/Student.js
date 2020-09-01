$(document).ready(function(){
    $(".add-row").click(function(){
        var id = $("#id").val();
        var name = $("#name").val();
        var age = $("#age").val();
        var address = $("#address").val();
        var gender = $("#gender").val();
        var markup = "<tr><td><input type='checkbox' name='record'></td><td>" + id + 
                    "</td><td>" + name + "</td><td>" + age + "</td><td>" + address + 
                    "</td><td>" + gender + "</td></tr>";
        $("table tbody").append(markup);
    });
    
    // Find and remove selected table rows
    $(".delete-row").click(function(){
        $("table tbody").find('input[name="record"]').each(function(){
            if($(this).is(":checked")){
                $(this).parents("tr").remove();
            }
        });
    });
});    