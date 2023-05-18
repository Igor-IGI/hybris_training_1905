<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product" %>
<%@ taglib prefix="nav" tagdir="/WEB-INF/tags/responsive/nav" %>
<%@ taglib prefix="storepickup" tagdir="/WEB-INF/tags/responsive/storepickup" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<div class="faq_list">
    <c:forEach items="${faqs}" var="faqItem" varStatus="loop">
        <div class="accordion" id="accordionExample">
            <div class="accordion-item">
                <h2 class="accordion-header" id="heading${loop.index}">
                    <button class="accordion-button" type="button" data-bs-toggle="collapse" data-bs-target="#collapse${loop.index}"
                            aria-expanded="true" aria-controls="collapse${loop.index}">
                            ${faqItem.title}
                    </button>
                    <div id="collapse${loop.index}" class="accordion-collapse collapse show" aria-labelledby="heading${loop.index}"
                         data-bs-parent="#accordionExample">
                        <div class="accordion-body">
                                ${faqItem.content}
                        </div>
                    </div>
                </h2>
            </div>
        </div>
    </c:forEach>
</div>
